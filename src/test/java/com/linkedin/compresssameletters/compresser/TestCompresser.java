package com.linkedin.compresssameletters.compresser;

public class TestCompresser {

    public void compress3SimpleWords() {
        String input = "AAA33334444";

        Compresser compresser = new Compresser();
        String compressedString = compresser.compress(input);

        System.out.println(compressedString);
    }
}
