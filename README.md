SourceRabbit GCode Sender
------
<p align="center">
<a href="https://www.sourcerabbit.com/Shop/"><img src="https://raw.githubusercontent.com/nsiatras/sourcerabbit-gcode-sender/master/Images/SourceRabbit.png" alt="SourceRabbit.com"></a>
</p>

Downloads
------

To download the latest installer for <b>Windows</b> and <b>Mac</b> please visit:<br>
[https://www.sourcerabbit.com/](https://www.sourcerabbit.com/)<br>

For other operating systems:<br>
[https://github.com/nsiatras/sourcerabbit-gcode-sender/releases/latest](https://github.com/nsiatras/sourcerabbit-gcode-sender/releases/latest)<br>

If you don't have Java installed please visit [https://java.com/en/download/manual.jsp](https://java.com/en/download/manual.jsp).

About SourceRabbit GCode Sender
------
SourceRabbit GCode Sender is a <b>GRBL</b> compatible, cross platform G-Code sender written in Java. It features a highly optimized and asynchronous (event-driven) UI and USB-to-Serial communication and can be also used on computers with small amount of RAM and CPU.

<b>Note for MAC users:</b> You may need to create a "/var/lock" directory with write permission. To do this open the Terminal application and run the following two commands: <br>
sudo mkdir /var/lock <br>
sudo chmod 777 /var/lock 

Technical details:
* Compatible with GRBL v0.9 and above
* Uses JSSC for serial communication
* Event-Driven UI and USB-to-Serial communication
* Developed with <b>NetBeans IDE</b>
* To build you need to open the project in Netbeans and just... build

Goals:
* Provide a fast, accurate and easy to use software
* Support all GRBL CNC router and milling machines
* Can be used on computers with small amount of RAM and CPU.


![Connect to your CNC!](https://github.com/nsiatras/sourcerabbit-gcode-sender/blob/master/Images/ConnectForm.png "Connect to your CNC!")

![GCode Sender Control Form](https://github.com/nsiatras/sourcerabbit-gcode-sender/blob/master/Images/ControlForm.png "CNC Control Form")

![Touch Probe](https://github.com/nsiatras/sourcerabbit-gcode-sender/blob/master/Images/Probe.png "Touch Probe")

![Hole Center Finder](https://github.com/nsiatras/sourcerabbit-gcode-sender/blob/master/Images/HoleCenterFinder.png "Hole Center Finder")
