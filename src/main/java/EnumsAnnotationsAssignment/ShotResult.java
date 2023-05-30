package EnumsAnnotationsAssignment;

public enum ShotResult {
        HIT('x'),
        MISS('o');

        private final char symbol;

        ShotResult(char symbol) {
            this.symbol = symbol;
        }

        public char asChar() {
            return symbol;
        }
}


