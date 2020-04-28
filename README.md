# Satellite
The UI consists of a label prompt at the top, an entry textbox under it, a button, and finally a label to hold the result.
The app computes the orbital period P of a satellite (i.e. how long it takes to go around the Earth once) given its height A above the Earth surface. The user enters A (in kilometers) and then taps the button. The result is shown in terms of the hours (integer), the minutes (integer), and the seconds (real, rounded to 1 decimal).
The design phase revealed that the following formula is to be used:
                    P = K(A+R)^3/2
Here, P is the orbital period in seconds, A is the altitude in kilometers, and K and R are constants: K=0.00995, R=6378.
As a test case, if the altitude is 1,000 km then the app's output should be:
                    1 hours, 45 minutes, and 5.7 seconds.
