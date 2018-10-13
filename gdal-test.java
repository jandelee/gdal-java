import org.gdal.gdal.gdal;
import org.gdal.gdal.Dataset;

class MyClass
{
   public static void main(String[] args)
   {
      gdal.AllRegister();
	    Dataset ds = gdal.Open("SatImage.tif");
	    int rasters = ds.GetRasterCount();
	    System.out.println("Number of rasters in image:" + rasters);
   }
}
