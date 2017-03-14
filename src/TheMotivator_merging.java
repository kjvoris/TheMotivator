
public class TheMotivator_merging {
		public void feedback(int score) {
			if (score == 100)
				System.out.println("You tried");
			else if (score > 90)
				System.out.println("That's just great");
			else if (score > 60)
				System.out.println("That's a good attempt");
			else
				System.out.println("Well, what can I say?");
		}
		public static void main(String[] args) {
			TheMotivator_merging tm = new TheMotivator_merging();
			tm.feedback(60);
		}
}
