# Verdlet is Java GUI-Based Installer application that runs on Desktop. 
chosen name comes after combination of old name "Green" (Verd) and "let" (Small).
Reason behind this is that Following Java app is very small and has green background. Also, Verdlet is modified version of "GreenPack Installer" app that I've made, 
because it wasn't fully finished by minimalist design or by functionality, so Verdlet is complete version of GreenPack Installer and it gives all 3 versions of GreenPack into zip file.

# What even is Greenpack?
Greenpack is Minecraft resourcepack that I've made 3 years ago, and it was designed to "make world greener" (as I say today) or make it in a way that it meets requirements of "PvP system" but I abandoned it after realizing that it was simple texture modifing process in zip file but for that time, It was even officially added to TLauncher after I requested it. But over 3 years, Greenpack got around 429 downloads and since people download three zip files, I wanted to make this installer which gives any of those three files much easily to you as user, if you click on "Download GreenPack" button after selecting Greenpack from Version Box.

# How was it made?
Of course, it was made in Java, specifically Java Swing and Java AWT. <br>

Java Swing -> In-built framework for GUI Development with Components that come from JRE System Library. Part of Java Fundation Classes (JFC )<br>
AWT -> Stands for "Abstract Window Toolkit" which is often paired with Swing. Is used for Layouts, Fonts, Colors and other additional classes. <br>

File giving is made by help of Java NIO. (Jar holds all those 3 zip files and releases them into local directory where jar is running.)

# What are requirements to run it?
 This time, You will be able to run Verdlet with basic JRE, **as long as you have Latest Version of Oracle's Java installed.** However, if you really want more safety with running it,
 you can setup latest JDK 25-26 with Evironment variables (Java Home), so you'll run without problems.
 Go to "Releases" section and **select "Verdlet Jar File"** and download it. You can run it By left clicking on it, or by Right clicking and Selecting "Open".
