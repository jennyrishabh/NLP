package com.search.NLP_sementic;

import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.CoreSentence;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.List;


//7

//neutral , +ve , -ve statements
public class SentimentAnalysis {

    public static void main(String[] args) {
        StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();
        String text = "Hello this is Rishabh. I really don`t like this place.";
        
        // check for : text = "Hello this is Rishabh. I don`t like this place.";
        
        
        CoreDocument coreDocument = new CoreDocument(text);
        stanfordCoreNLP.annotate(coreDocument);
        List<CoreSentence> sentences = coreDocument.sentences();
        for(CoreSentence sentence : sentences) {
            String sentiment = sentence.sentiment();
            System.out.println(sentiment + "\t" + sentence);

        }
    }

}
