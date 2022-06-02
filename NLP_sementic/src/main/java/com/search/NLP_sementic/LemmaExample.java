package com.search.NLP_sementic;

import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.List;


//5
public class LemmaExample {

    public static void main(String[] args) {

    	
    	// convert each word into minimum meaning ie., convert each word into a basic meaning so to compute something
        StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();

        String text = "I am doing my homework in the evening.";
        CoreDocument coreDocument = new CoreDocument(text);
        stanfordCoreNLP.annotate(coreDocument);
        List<CoreLabel> coreLabelList = coreDocument.tokens();
        for(CoreLabel coreLabel : coreLabelList) {
            String lemma = coreLabel.lemma();
            System.out.println(coreLabel.originalText() + " = "+ lemma);
        }
    }
}
