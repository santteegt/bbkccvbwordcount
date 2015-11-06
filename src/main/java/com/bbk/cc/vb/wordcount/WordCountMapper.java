package com.bbk.cc.vb.wordcount;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.commons.lang.StringUtils;

import java.io.IOException;

/**
 * Created by Venkat on 05/11/2015.
 */
public class WordCountMapper extends Mapper<LongWritable, Text, Text, IntWritable> {

    private Text out = new Text();
    private static final IntWritable ONE = new IntWritable(1);

    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {

        String [] words = value.toString().split(" ");
        for(String w : words){
            out.set(w);
            context.write(out, ONE);
        }
    }

}