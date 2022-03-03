--------------------------------------------------
public static void findNeedles(String haystack, String[] needles)
------------------------------

[Code to describe](#code-to-describe)

[Overview](#Overview)

[Input parameters](#input-parameters)

[Method constraints](#method-constraints)


# Code to describe

```
public static void findNeedles(String haystack, String[] needles) {
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
		for (int j = 0; j < needles.length; j++) {System.out.println(needles[j] + ": " + countArray[j]);
		}
	}
}
```


# Overview

The **findNeedles** method counts how many _needles_ there are in the _haystack_. _needles_ are specific words you want to find in a text, and _haystack_ is the text. The result is printed out in the console.

## Example:

### Variables:

String haystack = “Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis pulvinar nisi sit amet justo tincidunt, non facilisis lectus tristique. Maecenas in nunc vel felis vehicula varius et sit amet ipsum. Nunc laoreet justo ipsum. Nulla non bibendum diam, at sollicitudin nibh. Maecenas eu eros non risus faucibus euismod. Sed mauris ipsum, tincidunt sollicitudin condimentum non, sodales id sem. Phasellus fringilla condimentum lorem, at lacinia nunc pretium eu.”

String needle = new String [] {“non”, “sit”}

In this example, the **findNeddles** method will count all the occurrences of “non” and “sit” in the _haystack_ and print the result in the console. There are 3 occurrences of “non” and 3 occurrences of “sit”. The console output will be the following:

```
non:3  
sit:3
```

### To call the method:

`findNeedles(haystack, needles);`

# Input parameters

haystack – text delimited by the following characters:

- whitespace
- \t - tab
- \b - backspace (a step backward in the text or deletion of a single character)
- \n - new line
- \r - carriage return
- \f - form feed
- \' - single quote
- \" - double quote

needles – an array of words to count in the _haystack_

# Method constraints

The maximum number of _needles_ (words to search for in a text) you can provide is 5. If you provide more, the following error message will be displayed: “Too many words!”