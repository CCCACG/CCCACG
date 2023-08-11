## Addtional Experimental Results

### The variance of clone results

#### GitHub Copilot: Java

|   Interval    |  T1  |  T2  | VST3 | ST3  | MT3  | WT3/T4 |
| :-----------: | :--: | :--: | :--: | :--: | :--: | :----: |
|      0-2      | 0.01 | 0.01 | 0.00 | 0.02 | 0.05 |  0.19  |
|      2-4      | 0.00 | 0.01 | 0.00 | 0.01 | 0.03 |  0.09  |
|      4-8      | 0.01 | 0.00 | 0.00 | 0.01 | 0.05 |  0.34  |
|     8-16      | 0.00 | 0.00 | 0.00 | 0.00 | 0.01 |  0.13  |
|     16-32     | 0.77 | 0.05 | 0.01 | 0.14 | 0.00 |  0.04  |
|     32-64     | 0.05 | 0.01 | 0.02 | 0.07 | 0.10 |  0.13  |
|    64-128     | 0.00 | 0.01 | 0.00 | 0.01 | 0.06 |  0.23  |
|    128-256    | 0.02 | 0.03 | 0.01 | 0.01 | 0.06 |  0.27  |
|    256-512    | 0.19 | 0.02 | 0.01 | 0.02 | 0.03 |  0.09  |
|   512-1024    | 0.03 | 0.13 | 0.01 | 0.02 | 0.15 |  1.04  |
|   1024-2048   | 0.10 | 0.01 | 0.00 | 0.04 | 0.05 |  0.26  |
|   2048-4096   | 0.68 | 0.07 | 0.02 | 0.22 | 0.22 |  0.30  |
|   4096-8192   | 0.22 | 0.07 | 0.01 | 0.02 | 0.10 |  0.50  |
|    8192-inf   | 0.17 | 0.01 | 0.02 | 0.03 | 0.10 |  0.60  |



#### GitHub Copilot: C

|   Interval    |  T1  |  T2  | VST3 | ST3  | MT3  | WT3/T4 |
| :-----------: | :--: | :--: | :--: | :--: | :--: | :----: |
|      0-2      | 0.00 | 0.04 | 0.03 | 0.01 | 0.02 |  0.28  |
|      2-4      | 0.04 | 0.02 | 0.00 | 0.01 | 0.07 |  0.29  |
|      4-8      | 0.00 | 0.00 | 0.00 | 0.01 | 0.04 |  0.18  |
|     8-16      | 0.04 | 0.00 | 0.00 | 0.02 | 0.10 |  0.31  |
|     16-32     | 0.01 | 0.01 | 0.00 | 0.01 | 0.05 |  0.18  |
|     32-64     | 0.01 | 0.01 | 0.00 | 0.01 | 0.03 |  0.45  |
|    64-128     | 0.01 | 0.01 | 0.00 | 0.01 | 0.02 |  0.41  |
|    128-256    | 0.00 | 0.00 | 0.01 | 0.01 | 0.04 |  0.11  |
|    256-512    | 0.00 | 0.00 | 0.00 | 0.01 | 0.03 |  0.18  |
|   512-1024    | 0.40 | 0.01 | 0.03 | 0.27 | 0.17 |  0.46  |
|   1024-2048   | 0.07 | 0.05 | 0.01 | 0.08 | 0.25 |  0.91  |
|   2048-4096   | 0.00 | 0.01 | 0.00 | 0.01 | 0.03 |  0.33  |
|   4096-8192   | 0.00 | 0.01 | 0.00 | 0.00 | 0.03 |  0.43  |
|    8192-inf   | 0.00 | 0.00 | 0.00 | 0.01 | 0.06 |  0.08  |



#### GitHub Copilot: Python

|   Interval    |  T1  |  T2  | VST3 | ST3  | MT3  | WT3/T4 |
| :-----------: | :--: | :--: | :--: | :--: | :--: | :----: |
|      0-2      | 0.00 | 0.00 | 0.00 | 0.02 | 0.15 |  0.36  |
|      2-4      | 0.00 | 0.00 | 0.00 | 0.01 | 0.05 |  0.37  |
|      4-8      | 0.00 | 0.01 | 0.00 | 0.03 | 0.17 |  0.59  |
|     8-16      | 0.00 | 0.00 | 0.00 | 0.02 | 0.02 |  1.39  |
|     16-32     | 0.00 | 0.00 | 0.00 | 0.04 | 0.17 |  0.54  |
|     32-64     | 0.00 | 0.00 | 0.00 | 0.03 | 0.11 |  0.60  |
|    64-128     | 0.00 | 0.00 | 0.00 | 0.03 | 0.05 |  0.53  |
|    128-256    | 0.00 | 0.01 | 0.00 | 0.02 | 0.07 |  0.48  |
|    256-512    | 0.00 | 0.01 | 0.00 | 0.04 | 0.04 |  0.39  |
|   512-1024    | 0.01 | 0.03 | 0.00 | 0.06 | 0.12 |  0.50  |
|   1024-2048   | 0.01 | 0.03 | 0.00 | 0.02 | 0.06 |  0.41  |
|   2048-4096   | 0.00 | 0.01 | 0.00 | 0.05 | 0.17 |  0.29  |
|   4096-8192   | 0.00 | 0.00 | 0.00 | 0.01 | 0.13 |  0.14  |
|    8192-inf   | 0.01 | 0.01 | 0.00 | 0.02 | 0.05 |  0.32  |



#### Amazon CodeWhisperer: Java

|   Interval    |  T1  |  T2  | VST3 | ST3  | MT3  | WT3/T4 |
| :-----------: | :--: | :--: | :--: | :--: | :--: | :----: |
|      0-2      | 0.00 | 0.00 | 0.00 | 0.00 | 0.00 |  0.09  |
|      2-4      | 0.00 | 0.00 | 0.00 | 0.00 | 0.00 |  0.01  |
|      4-8      | 0.00 | 0.00 | 0.00 | 0.00 | 0.00 |  0.00  |
|     8-16      | 0.00 | 0.00 | 0.00 | 0.00 | 0.00 |  0.02  |
|     16-32     | 0.00 | 0.00 | 0.00 | 0.00 | 0.00 |  0.00  |
|     32-64     | 0.00 | 0.00 | 0.00 | 0.00 | 0.00 |  0.00  |
|    64-128     | 0.00 | 0.00 | 0.00 | 0.00 | 0.00 |  0.00  |
|    128-256    | 0.00 | 0.00 | 0.00 | 0.00 | 0.00 |  0.00  |
|    256-512    | 0.00 | 0.00 | 0.00 | 0.00 | 0.00 |  0.00  |
|   512-1024    | 0.00 | 0.00 | 0.00 | 0.00 | 0.00 |  0.00  |
|   1024-2048   | 0.00 | 0.00 | 0.00 | 0.00 | 0.00 |  0.00  |
|   2048-4096   | 0.00 | 0.00 | 0.00 | 0.00 | 0.00 |  0.00  |
|   4096-8192   | 0.00 | 0.00 | 0.00 | 0.00 | 0.00 |  0.00  |
|    8192-inf   | 0.00 | 0.00 | 0.00 | 0.00 | 0.00 |  0.00  |



#### Amazon CodeWhisperer: Python

|   Interval    |  T1  |  T2  | VST3 | ST3  | MT3  | WT3/T4 |
| :-----------: | :--: | :--: | :--: | :--: | :--: | :----: |
|      0-2      | 0.00 | 0.00 | 0.00 | 0.00 | 0.00 |  0.00  |
|      2-4      | 0.00 | 0.00 | 0.00 | 0.00 | 0.00 |  0.21  |
|      4-8      | 0.00 | 0.00 | 0.00 | 0.00 | 0.00 |  0.01  |
|     8-16      | 0.00 | 0.00 | 0.00 | 0.00 | 0.00 |  0.03  |
|     16-32     | 0.00 | 0.00 | 0.00 | 0.00 | 0.00 |  0.02  |
|     32-64     | 0.00 | 0.00 | 0.00 | 0.00 | 0.00 |  0.04  |
|    64-128     | 0.00 | 0.00 | 0.00 | 0.00 | 0.00 |  0.03  |
|    128-256    | 0.00 | 0.00 | 0.00 | 0.00 | 0.00 |  0.35  |
|    256-512    | 0.00 | 0.01 | 0.00 | 0.00 | 0.00 |  1.11  |
|   512-1024    | 0.00 | 0.01 | 0.00 | 0.00 | 0.01 |  0.10  |
|   1024-2048   | 0.00 | 0.01 | 0.00 | 0.00 | 0.00 |  1.42  |
|   2048-4096   | 0.00 | 0.00 | 0.00 | 0.00 | 0.00 |  0.02  |
|   4096-8192   | 0.00 | 0.00 | 0.00 | 0.00 | 0.00 |  0.01  |
|    8192-inf   | 0.00 | 0.00 | 0.00 | 0.00 | 0.00 |  0.92  |



#### GitHub Copilot Chat: Java

|   Interval    |  T1  |  T2  | VST3 | ST3  | MT3  | WT3/T4 |
| :-----------: | :--: | :--: | :--: | :--: | :--: | :----: |
|      0-2      | 0.02 | 0.02 | 0.00 | 0.02 | 0.07 |  0.65  |
|      2-4      | 0.01 | 0.00 | 0.00 | 0.02 | 0.05 |  0.43  |
|      4-8      | 0.01 | 0.03 | 0.00 | 0.03 | 0.06 |  0.88  |
|     8-16      | 0.02 | 0.02 | 0.00 | 0.02 | 0.05 |  1.79  |
|     16-32     | 0.05 | 0.00 | 0.00 | 0.02 | 0.10 |  0.72  |
|     32-64     | 0.02 | 0.03 | 0.00 | 0.05 | 0.11 |  0.65  |
|    64-128     | 0.02 | 0.01 | 0.03 | 0.03 | 0.06 |  1.51  |
|    128-256    | 0.02 | 0.05 | 0.01 | 0.01 | 0.11 |  0.81  |
|    256-512    | 0.02 | 0.02 | 0.00 | 0.03 | 0.08 |  0.53  |
|   512-1024    | 0.05 | 0.04 | 0.00 | 0.03 | 0.06 |  0.51  |
|   1024-2048   | 0.08 | 0.03 | 0.00 | 0.00 | 0.12 |  0.45  |
|   2048-4096   | 0.05 | 0.00 | 0.02 | 0.11 | 0.04 |  1.10  |
|   4096-8192   | 0.01 | 0.02 | 0.00 | 0.05 | 0.18 |  0.96  |
|    8192-inf   | 0.09 | 0.03 | 0.02 | 0.04 | 0.14 |  0.58  |



#### GitHub Copilot Chat: C

|   Interval    |  T1  |  T2  | VST3 | ST3  | MT3  | WT3/T4 |
| :-----------: | :--: | :--: | :--: | :--: | :--: | :----: |
|      0-2      | 0.01 | 0.00 | 0.00 | 0.03 | 0.10 |  0.94  |
|      2-4      | 0.01 | 0.01 | 0.00 | 0.02 | 0.06 |  2.15  |
|      4-8      | 0.00 | 0.00 | 0.00 | 0.01 | 0.06 |  1.27  |
|     8-16      | 0.01 | 0.01 | 0.00 | 0.01 | 0.09 |  1.28  |
|     16-32     | 0.02 | 0.01 | 0.00 | 0.03 | 0.24 |  0.80  |
|     32-64     | 0.01 | 0.01 | 0.00 | 0.01 | 0.04 |  1.33  |
|    64-128     | 0.02 | 0.01 | 0.01 | 0.02 | 0.17 |  1.20  |
|    128-256    | 0.01 | 0.02 | 0.00 | 0.07 | 0.13 |  1.63  |
|    256-512    | 0.01 | 0.01 | 0.00 | 0.05 | 0.11 |  1.56  |
|   512-1024    | 0.02 | 0.01 | 0.00 | 0.04 | 0.10 |  0.75  |
|   1024-2048   | 0.00 | 0.02 | 0.00 | 0.01 | 0.07 |  0.88  |
|   2048-4096   | 0.00 | 0.01 | 0.00 | 0.04 | 0.10 |  0.69  |
|   4096-8192   | 0.02 | 0.00 | 0.01 | 0.03 | 0.07 |  0.63  |
|    8192-inf   | 0.00 | 0.00 | 0.00 | 0.02 | 0.07 |  0.53  |



#### GitHub Copilot Chat: Python

|   Interval    |  T1  |  T2  | VST3 | ST3  | MT3  | WT3/T4 |
| :-----------: | :--: | :--: | :--: | :--: | :--: | :----: |
|      0-2      | 0.00 | 0.01 | 0.00 | 0.03 | 0.15 |  0.33  |
|      2-4      | 0.01 | 0.01 | 0.01 | 0.02 | 0.10 |  0.38  |
|      4-8      | 0.00 | 0.02 | 0.00 | 0.03 | 0.09 |  0.44  |
|     8-16      | 0.01 | 0.01 | 0.00 | 0.05 | 0.19 |  0.54  |
|     16-32     | 0.01 | 0.01 | 0.00 | 0.02 | 0.10 |  0.11  |
|     32-64     | 0.01 | 0.00 | 0.01 | 0.04 | 0.15 |  0.56  |
|    64-128     | 0.01 | 0.01 | 0.00 | 0.03 | 0.11 |  0.37  |
|    128-256    | 0.01 | 0.00 | 0.00 | 0.02 | 0.05 |  0.66  |
|    256-512    | 0.01 | 0.05 | 0.01 | 0.05 | 0.02 |  0.15  |
|   512-1024    | 0.00 | 0.02 | 0.00 | 0.04 | 0.05 |  0.13  |
|   1024-2048   | 0.00 | 0.01 | 0.00 | 0.02 | 0.12 |  0.54  |
|   2048-4096   | 0.00 | 0.01 | 0.00 | 0.01 | 0.20 |  0.57  |
|   4096-8192   | 0.00 | 0.01 | 0.00 | 0.03 | 0.09 |  0.55  |
|    8192-inf   | 0.01 | 0.03 | 0.00 | 0.07 | 0.14 |  0.58  |





## RQ1

The code files in **RQ1/(commercial AI code generator name)/(programming language)/(code file)** are some interesting cases in our RQ1 experiment. The rules for naming these code files are as follows:

- **Type-1 Case**: The two code fragments in this code file are classified as the Type-1 (T1) clone.
- **Type-2 Case**: The two code fragments in this code file are classified as the Type-2 (T2) clone.
- **VST-3 Case**: The two code fragments in this code file are classified as the Very-Strongly Type-3 (VST-3) clone.
- **ST-3 Case**: The two code fragments in this code file are classified as the Strongly Type-3 (ST-3) clone.
- **MT-3 Case**: The two code fragments in this code file are classified as the Moderately Type-3 (MT-3) clone.
- **WT3&T4 Case**: The two code fragments in this code file are classified as the Weakly Type-3/Type-4 (WT3/T4) clone.


Note that the first code fragment in each code file is the source code in our dataset, while the second code fragment in each code file is the code generated by AI code generators.




## RQ2

The code files in **RQ2/(commercial AI code generator name)/(programming language)/(code file)** are some cases in our RQ2 experiment. These code files are named according to their transformation rules:

- **NameChange**: This code file contains two parts. The first part is the original prompt, while the second part is the prompt generated by applying **identifier name change** transformation to the original prompt.
- **ParameterOrder**: This code file contains two parts. The first part is the original prompt, while the second part is the prompt generated by applying **parameter order change** transformation to the original prompt.
- **Paraphrase**: This code file contains two parts. The first part is the original prompt, while the second part is the prompt generated by applying **comment paraphrasing** transformation to the original prompt.



## RQ3

The Markdown file **RQ3/Methodology.md** contains detailed information about how we convert one code fragment into a regular expression. 

The code file **RQ3/example/prompt_00491.java** is an example code file that we use to search for its undiscovered clone with GitHub Search. 

The folder **RQ3/example/search_result/** contains the search results from GitHub Search, after transforming our example code into a regular expression to search.
