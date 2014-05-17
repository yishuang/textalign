package myself.textalign;

import java.util.ArrayList;

public class Utils {

	public static ArrayList<String> fullJustify(String[] words, int L) {
		ArrayList<String> list = new ArrayList<String>();
		int i = 0;
		while (i < words.length) {
			int size = 0;
			int beg = i;
			// how many words can be held in each line
			while (i < words.length) {
				int newSize = size == 0 ? words[i].length() : size + 1
						+ words[i].length();
				if (newSize <= L)
					size = newSize;
				else
					break;
				i++;
			}
			int spaceCount = L - size;
			int everyCount;
			if (i - 1 - beg != 0 && i != words.length) {
				everyCount = spaceCount / (i - 1 - beg);
				spaceCount %= (i - 1 - beg);
			} else
				everyCount = 0; // last line or non-last line with only One word
			String s = "";
			for (int j = beg; j < i; j++) {
				if (j == beg)
					s = words[j];
				else {
					s += " ";
					for (int k = 0; k < everyCount; k++)
						s += " ";
					if (spaceCount > 0 && i != words.length) {
						s += " ";
						spaceCount--;
					}
					s += words[j];
				}
			}
			for (int p = 0; p < spaceCount; p++)
				// last line or non-last line with only One word
				s += " ";
			list.add(s);
		}
		return list;
	}

}
