package com.search.NLP_sementic;

import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.Properties;

//1
public class Pipeline {

    private static Properties properties;
    //pos = part of speech
    //ner = named entity recognizer
    private static String propertiesName = "tokenize, ssplit, pos, lemma, ner, parse, sentiment";
    private static StanfordCoreNLP stanfordCoreNLP;

    //singleton class 
    private Pipeline() { }

    static {
        properties = new Properties();
        properties.setProperty("annotators", propertiesName);
    }

    public static StanfordCoreNLP getPipeline() {
        if(stanfordCoreNLP == null) {
            stanfordCoreNLP = new StanfordCoreNLP(properties);
            System.out.println("called getproperties() :"+stanfordCoreNLP.hashCode());
        }
        return stanfordCoreNLP;
    }
}
