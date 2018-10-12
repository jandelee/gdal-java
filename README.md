# gdal-java
Example of getting GDAL running on Ubuntu for a simple JAVA app

Rather than build GDAL, use the binaries that are maintained by ubuntugis.  First, add the package manager, and then install gdal
```bash
sudo add-apt-repository ppa:ubuntugis/ppa
press <ENTER>
sudo apt-get update

sudo apt-get install libgdal-java libgdal20
```

