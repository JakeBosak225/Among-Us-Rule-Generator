import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Random;

public class Main {
	public static Random rng = new Random();

	public static void main(String[] args) {

		// Can be True of False
		boolean confrimEjects = rng.nextBoolean();
		boolean visualTask = rng.nextBoolean();

		// Can be 0 -9
		int emergencyMeetings = getRandomIntInRange(0, 9);

		// Can be 5 - 60(in increments of 5)
		int emergencyCooldown = getRandomIntWithIncrements(5, 60, 5);

		// Can be 15 - 60(in increments of 15)
		int discussionTime = getRandomIntWithIncrements(15, 60, 15);
		int votingTime = getRandomIntWithIncrements(15, 60, 15);

		// can be 1,2 or 3 (1 = Short, 2 = med, 3 = Long)
		String killDistance = getKillDistance();

		// Can be 0 -2
		int commonTask = getRandomIntInRange(0, 2);

		// can be 0 - 3
		int longTask = getRandomIntInRange(0, 3);

		// can be 0 -5
		int shortTask = getRandomIntInRange(0, 5);

		// can be 0.5 - 3.0(in increments of .25)
		double playerSpeed = getRandomDoubleWithIncrements(0.5, 3.0, .25);

		// can be .25 - 5.0(in increments of .25)
		double crewmateVision = getRandomDoubleWithIncrements(0.25, 5.0, .25);
		double imposterVision = getRandomDoubleWithIncrements(0.25, 5.0, .25);

		// can be 10.0 - 35.0(in increments of 2.5)
		double killCooldown = getRandomDoubleWithIncrements(10.0, 35.0, 2.5);

		System.out.println("Here are your randomized rules! Enjoy!");
		System.out.println("Emergency Meetings: " + emergencyMeetings);
		System.out.println("Emergency Meeting Cooldown: " + emergencyCooldown + "s");
		System.out.println("Discussion Time: " + discussionTime + "s");
		System.out.println("Voting Time: " + votingTime + "s");
		System.out.println("Player Speed: " + playerSpeed + "x");
		System.out.println("Crewmate Vision: " + crewmateVision + "x");
		System.out.println("Imposter Vision: " + imposterVision + "x");
		System.out.println("Kill Cooldown: " + killCooldown + "s");
		System.out.println("Kill Distance: " + killDistance);
		System.out.println("# Common Task: " + commonTask);
		System.out.println("# Long Task: " + longTask);
		System.out.println("# Short Task: " + shortTask);
	}

	public static int getRandomIntInRange(int minRange, int maxRange) {
		return rng.nextInt(maxRange - minRange + 1) + minRange;
	}

	public static int getRandomIntWithIncrements(int minRange, int maxRange, int increment) {
		int randomNumber;

		do {
			randomNumber = rng.nextInt(maxRange - minRange + 1) + minRange;
		} while (randomNumber % increment != 0);

		return randomNumber;
	}

	public static double getRandomDoubleWithIncrements(double minRange, double maxRange, double increment) {
		double randomDouble;
		NumberFormat formatter = new DecimalFormat("#0.00");

		do {
			randomDouble = rng.nextDouble() * (maxRange - minRange) + minRange;
			randomDouble = Double.parseDouble(formatter.format(randomDouble));

		} while (randomDouble % increment != 0);

		return randomDouble;
	}

	public static String getKillDistance() {
		int distanceInNumber = rng.nextInt(3 - 1 + 1) + 1;

		if (distanceInNumber == 1) {
			return "Short";
		} else if (distanceInNumber == 2) {
			return "Medium";
		}

		return "Long";
	}

}
