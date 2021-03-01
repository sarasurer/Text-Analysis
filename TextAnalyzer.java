

/**
 * <h1>Text Analyser Stored Datas </h1>
 * This program stored given each value and it helps to compute.
 */

public  class TextAnalyzer {

        private char txt;
        private int freq;
        private int counter;

        public TextAnalyzer(char txt, int freq, int counter)

        {
            this.txt = txt;
            this.freq = freq;
            this.counter = counter;
        }

        public char getTxt()
        {
            return txt;
        }
        public void setTxt(char txt)
        {
            this.txt = txt;
        }

        public int getFreq()
        {
            return freq;
        }
        public void setFreq(int freq)
        {
            this.freq = freq;
        }

        public int getCounter()
        {
            return counter;
        }
        public void setCounter(int counter){ this.counter = counter; }

    }

