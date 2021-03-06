# gdal-java
Example of getting GDAL running on Ubuntu Xenial for a simple JAVA app

Rather than build GDAL, use the binaries that are maintained by ubuntugis.  First, add the package manager, and then install gdal
```bash
sudo add-apt-repository ppa:ubuntugis/ppa
press <ENTER>
sudo apt-get update

sudo apt-get install libgdal-java libgdal20
Enter 'Y'
```

Download this repository.
```bash
git clone https://github.com/jandelee/gdal-java.git
cd gdal-java
```

Download Java (for Trusty, use openjdk-7-jdk).
```bash
sudo apt install openjdk-9-jdk-headless
Enter 'Y'
```

Compile and run the sample Java app
```bash
export CLASSPATH=.:/usr/share/java/gdal.jar
javac gdal-test.java
java MyClass
```

This should result in:
```bash
Number of rasters in image:3
```

These steps worked successfully with Xenial Ubuntu both on AWS EC2 using a Canonical AMI and also on Windows System for Linux running Xenial Ubuntu.
