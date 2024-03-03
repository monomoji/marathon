

        public class Homework1{
            private int[] periods;

            public Homework1(int[] periods) {
                this.periods = periods;
            }

            public int[] getPeriods() {
                return periods;
            }

            public void setPeriods(int[] periods) {
                this.periods = periods;
            }

            public int first() {
                int minTime = periods[0];
                int line = 0;
                for (int i = 0; i < periods.length; i++) {
                    if (periods[i] < minTime) {
                        minTime = periods[i];
                        line= i;
                    }
                }
                return line;
            }

            public int second() {
                int minTime = periods[first()];
                int minTime2 = periods[0];
                int line = 0;
                for (int i = 0; i < periods.length; i++) {
                    if (periods[i] < minTime2 && periods[i] > minTime) {
                        minTime2 = periods[i];
                        line = i;
                    }
                }
                return line;
            }

            public int third() {
                int minTime = periods[first()];
                int minTime2 = periods[second()];
                int minTime3 = periods[0];
                int line = 0;
                for (int i = 0; i < periods.length; i++) {
                    if (periods[i] < minTime3 && periods[i] > minTime2 && periods[i] > minTime) {
                        minTime3 = periods[i];
                        line = i;
                    }
                }
                return line;
            }

            public void letter() {
                int A = 0;
                int B = 0;
                int C = 0;
                int j = 2;
                for (int i = 0; i < periods.length; i++) {
                    if (periods[i] >= j * 100 && periods[i] <= j * 100 + 99)
                        A++;
                    if (periods[i] >= j * 100 + 100 && periods[i] <= j * 100 + 199)
                        B++;
                    if (periods[i] >= j * 100 + 200)
                        C++;
                }
                System.out.println("A --> " + A);
                System.out.println("B --> " + B);
                System.out.println("C --> " + C);
            }

}