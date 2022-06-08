package org.apache.spark.sql.execution.benchmark

class TablesTest extends org.scalatest.funsuite.AnyFunSuite {

  test("getNumPartitions") {

    val tables = new Tables(null, 16)

    assert(tables.getNumPartitions("catalog_sales", 128) == 13)
    assert(tables.getNumPartitions("catalog_sales", 256) == 7)
    assert(tables.getNumPartitions("catalog_sales", 512) == 4)
    assert(tables.getNumPartitions("catalog_page", 128) == 1)


  }

}
