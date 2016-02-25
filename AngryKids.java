package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class AngryKids {

	static BufferedReader in = new BufferedReader(new InputStreamReader(
			System.in));
	static StringBuilder out = new StringBuilder();

	public static void main(String[] args) throws NumberFormatException,
			IOException {

		int numPackets = Integer.parseInt(in.readLine());
		int numKids = Integer.parseInt(in.readLine());
		int[] packets = new int[numPackets];

		for (int i = 0; i < numPackets; i++) {
			packets[i] = Integer.parseInt(in.readLine());
		}

		int unfairness = Integer.MAX_VALUE;

		// int[] kits = { 10, 100, 300, 200, 1000, 20, 30 };
		// int counter = 3;

		Arrays.sort(packets);

		int temp = Integer.MAX_VALUE;
		for (int j = 0; j < packets.length; j++) {

			int grpCount = j + numKids;
			int diff = 0;
			for (int i = j; i < grpCount; i++) {

				if (i < packets.length - 1 && grpCount <= packets.length) {
					diff = packets[grpCount - 1] - packets[j];
					if (diff < unfairness) {
						unfairness = diff;
					}
					break;

				}

			}

		}
		System.out.println(unfairness);
	}
}
