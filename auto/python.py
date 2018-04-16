# problem 1
def digits(n):
   rtn = 1;
   while(n/10!=1):
    rtn = rtn+1;
    n = n/10;
   return rtn;

def reverse(n):
  result = 0
  digit = 0
  while n>=10:
    n = n/10
    digit = digit + 1
  # then use the formula to calculate the result
  for i in range(digit,0, -1):
    result = result + n/(10^i) * 10^(digit-i)
    n = n%(10^i)  

def hello():
     return "hello world"; 