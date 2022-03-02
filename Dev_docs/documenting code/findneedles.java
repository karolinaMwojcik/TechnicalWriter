public class Main {
  public static void main(String[] args) {
  String haystack = "Lorem\ripsum\rdolor\rsit\ramet,\rconsectetur\radipiscing\relit.\rDuis\rpulvinar\rnisi\rsit\ramet\rjusto\rtincidunt,\rnon\rfacilisis\rlectus\rtristique.\rMaecenas\rin\rnunc\rvel\rfelis\rvehicula\rvarius\ret\rsit\ramet\ripsum.\rNunc\rlaoreet\rjusto\ripsum.\rNulla\rnon\rbibendum\rdiam,\rat\rsollicitudin\rnibh.\rMaecenas\reu\reros\rnon\rrisus\rfaucibus\reuismod.\rSed\rmauris\ripsum,\rtincidunt\rsollicitudin\rcondimentum\rnon,\rsodales\rid\rsem.\rPhasellus\rfringilla\rcondimentum\rlorem,\rat\rlacinia\rnunc\rpretium\reu.";

String[] needles = new String[] {"non", "sit"};

findNeedles(haystack,needles);
  }

  
public static void findNeedles(String haystack, String[]
needles) {
if (needles.length > 5) {
System.err.println("Too many words!");
} else {
int[] countArray = new int[needles.length];
for (int i = 0; i < needles.length; i++) {
String[] words = haystack.split("[ \"\'\t\n\b\f\r]", 0);
for (int j = 0; j < words.length; j++) {
if (words[j].compareTo(needles[i]) == 0) {
countArray[i]++;
}
}
}
for (int j = 0; j < needles.length; j++) {
System.out.println(needles[j] + ": " + countArray[j]);
}
}
  }
}