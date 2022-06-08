
## How to generate TPCDS data

    spark-submit --driver-memory 16G --executor-memory 16G \
    --class org.apache.spark.sql.execution.benchmark.TPCDSDatagen \
    --master local[*] --conf "mapreduce.fileoutputcommitter.marksuccessfuljobs=false" \
    /home/ubuntu/jars/spark-tpcds-datagen_2.12-0.1.0-SNAPSHOT-with-dependencies.jar \
    --num-partitions 16 --scale-factor 16 --output-location "[LOCATION]" --format parquet --overwrite \
    --file-size 128 --num-process 8

## Options for the generator

    $ ./bin/dsdgen --help
    Usage: spark-submit --class <this class> --conf key=value <spark tpcds datagen jar> [Options]
    Options:
      --output-location [STR]                Path to an output location
      --scale-factor [NUM]                   Scale factor (default: 1)
      --format [STR]                         Output format (default: parquet)
      --overwrite                            Whether it overwrites existing data (default: false)
      --partition-tables                     Whether it partitions output data (default: false)
      --use-double-for-decimal               Whether it prefers double types instead of decimal types (default: false)
      --use-string-for-char                  Whether it prefers string types instead of char/varchar types (default: false)
      --cluster-by-partition-columns         Whether it cluster output data by partition columns (default: false)
      --filter-out-null-partition-values     Whether it filters out NULL partitions (default: false)
      --table-filter [STR]                   Queries to filter, e.g., catalog_sales,store_sales
      --num-partitions [NUM]                 # of partitions (default: 100)
      --file-size [NUM]                      output file size (default: 128MB)
      --num-process [NUM]                    # of parallel dsdgen process to spawn


