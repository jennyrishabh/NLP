package com.search.NLP_sementic;

import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.List;
import java.util.stream.Collectors;


//6
public class NERExample {

    public static void main(String[] args) {
    	
    	// determine each word genre : 
        StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();

        String text = "Hey! My name is Rishabh and I have friend his name is Aman." +
                " We both are living in U.S.A or New Delhi";

        CoreDocument coreDocument = new CoreDocument(text);

        stanfordCoreNLP.annotate(coreDocument);

        List<CoreLabel> coreLabels = coreDocument.tokens();
        
        for(CoreLabel coreLabel : coreLabels) {
        	String ner = coreLabel.get(CoreAnnotations.NamedEntityTagAnnotation.class);
        	
        	System.out.println(coreLabel.originalText()+" : "+ner );
        }
        
        /*
        List nameList = coreLabels
                .stream()
                .filter(coreLabel -> "Person".equalsIgnoreCase(coreLabel.get(CoreAnnotations.NamedEntityTagAnnotation.class)))
                .collect(Collectors.toList());

        System.out.println(nameList);
        */
    }
}
