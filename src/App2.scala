

import hdf.hdf5lib.H5;
import hdf.hdf5lib.HDF5Constants;
import hdf.`object`._;
import hdf.`object`.h5._;
import scala.collection.JavaConversions._


/**
 * @author ${user.name}
 */
object App2 {

  def foo(x: Array[String]) = x.foldLeft("")((a, b) => a + b)

  def main(args: Array[String]) {

    val file2 = new H5File("c:/tabeel/tes/ERR175707_output.hdf5");

    val c = file2.get("counts")
    println(c)
    c.open()
    val sc = c.asInstanceOf[ScalarDS]
    println(sc.getData.asInstanceOf[Array[Long]].take(10).mkString(", "))
    println(sc.getDatatype.getDatatypeDescription)
    println(sc.getRank)

  }

}
