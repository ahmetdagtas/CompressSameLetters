package com.linkedin.compresssameletters.compresser;


/*
 * Coding Scenario 1:
 * The aim is to use first 6 bytes for A-Z 0-9 There is 26+10 = 36 characters is used.
 * 2^16=65536 -> 65536 - 36 = There is 65500 values left. It is left to us how it is going to be used.
 * If the character reoccurance amount is beyond 65500's holding capacity,
 *  the next two byte's first 36 byte will keep the same letter
 *  the remaining 6500 will be added to the previous value.
 *  the decompress should be careful about this one, as well.
 *
 * Coding Scenario 2:
 * The aim is to use first 6 bytes for A-Z 0-9 There is 26+10 = 36 characters is used.
 * Then the remaining 10 bytes to use 2^10 = 1024 (the compressed amount of the recurring)
 * The recurring will be searched if it can be extended a bigger amount, such as constant multiply pow
 */
public class Compresser {

    public String compress(String input) {
        String output = "A132C";
        
        String[] splittedChunks = splitIntoChunks(input);
        
        
        return output;
    }


    private String[] splitIntoChunks(String input) {
        return null;
    }
}
