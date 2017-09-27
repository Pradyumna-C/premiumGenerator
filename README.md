# premiumGenerator

Tech stack: 
> AngularJs
> Spring Boot 

This is a sample application that i built  when asked in an interview.

THE PROBLEM
Narayan is looking for a health insurance quote using this application.

INPUT:
Name: Norman Gomes
Gender: Male
Age: 34 years
Current health:


Hypertension: No
Blood pressure: No
Blood sugar: No
Overweight: Yes


Habits:
Smoking: No
Alcohol: Yes
Daily exercise: Yes
Drugs: No

OUTPUT :
Health Insurance Premium for Mr. Narayan : Rs. 5666.1

BUSINESS RULES :
Base premium for anyone below the age of 18 years = Rs. 5,000
% increase based on age: 18-40 -> +10% | 40+ -> 20%
Gender rule: Male vs female vs Other % -> Increase 2% over standard slab for Males
Pre-existing conditions (Hypertension | Blook pressure | Blood sugar | Overweight) -> Increase of 1% per condition

Habits
Good habits (Daily exercise) -> Reduce 3% for every good habit
Bad habits (Smoking | Consumption of alcohol | Drugs) -> Increase 3% for every bad habit
