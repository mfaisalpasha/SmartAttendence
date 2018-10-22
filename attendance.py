import time
import serial
import RPi.GPIO as GPIO
import urllib2
import os
import pymysql
GPIO.setmode(GPIO.BOARD)
GPIO.setwarnings(False)

ans=1
PortRF = serial.Serial('/dev/serial0',9600)
PortRF.flushInput()
while True:
    os.system('clear')
    print ("\nSwipe your ID card please ")
    conn=pymysql.connect(host='208.91.199.89',user='faisal_atten',password='01616167002',db='faisal_attendance')
    a=conn.cursor()
    ID = ""
    read_byte = PortRF.read()
    if read_byte=="\x02":
        for Counter in range(12):
            read_byte=PortRF.read()
            ID = ID + str(read_byte)
            #print hex(ord( read_byte))
        #print (ID)
        PortRF.flushInput()
        
        CheckStdID="SELECT emp_id FROM `employee` WHERE `RFID`= %s;"
        a.execute(CheckStdID,ID)
        emp = a.fetchone()
        ID = ""
        read_byte =""

        if emp is not None:
            em=str(emp[0])
            check_query= "SELECT emp_id FROM `attendance` WHERE e_date=CURRENT_DATE() and emp_id= %s;"
            a.execute(check_query,em)
            res = a.fetchone()
            if res is not None:                
                update_query= "update attendance set out_time=current_time() where e_date=current_date() and emp_id= %s;"
                a.execute(update_query,em)
                PortRF.flushInput()
                print ("Bye! " +em)
                 
            else:
                insert_query="INSERT INTO `attendance` (`record`, `e_date`, `emp_id`, `in_time`, `out_time`) VALUES (null, CURRENT_DATE(), %s, CURRENT_TIME(), '00:00:00');"
                a.execute(insert_query,em)
                #print ans
                PortRF.flushInput()
                print ("WelCome! "+em)

                        
        else:
            
            print "Access Denied"
            
    PortRF.flushInput()
    conn.commit()
    time.sleep(2)
    ans+=1
