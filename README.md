# bbkccvbwordcount

Word Count example with maven build configuration.

This is a Java example for map reduce programming with a basic Mapper, Reducer and a Sample Job.

The code can be build to a jar using maven build and can be executed on hadoop with input and output configurations.

Main class set up is already added in manifest so when executing the jar, don't need to add this argument.

Generally mapreduce job will fail if the out put directory already exist, but this job is configured to delete the output directory
if it is already exists, if you want to keep the old output directories you need to comment the line in Job file.
