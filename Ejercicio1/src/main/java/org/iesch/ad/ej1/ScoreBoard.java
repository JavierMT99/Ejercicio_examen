package org.iesch.ad.ej1;

    public class ScoreBoard {

        private Integer empate;
        private Integer ganas;
        private Integer pierdes;

        public ScoreBoard() {
            empate = 0;
            ganas = 0;
            pierdes = 0;
        }

        public Integer getTie() {
            return empate;
        }

        public Integer getWins() {
            return ganas;
        }

        public Integer getLosses() {
            return pierdes;
        }

        public void incrementWins() {
            ganas++;
        }

        public void incrementLosses() {
            pierdes++;
        }

        public void incrementTie() {
            empate++;
        }
    }

