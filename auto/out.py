# problem 1   # this is line 1
def digits(n):   # this is line 2
   rtn = 1;   # this is line 3
   while(n/10!=1):   # this is line 4
    rtn = rtn+1;   # this is line 5
    n = n/10;   # this is line 6
   return rtn;   # this is line 7
   # this is line 8
def reverse(n):   # this is line 9
  result = 0   # this is line 10
  digit = 0   # this is line 11
  while n>=10:   # this is line 12
    n = n/10   # this is line 13
    digit = digit + 1   # this is line 14
  # then use the formula to calculate the result   # this is line 15
  for i in range(digit,0, -1):   # this is line 16
    result = result + n/(10^i) * 10^(digit-i)   # this is line 17
    n = n%(10^i)     # this is line 18
   # this is line 19
def hello():   # this is line 20
     return "hello world";    # this is line 21
