# n = 12
# i = raw_input('input: ')
# print ('You name is %r and number is %d' %(i,n))
# print type(i)
#
# a = 21
# b = 3
#
# if a > b:
#     print 'a is max'
# else:
#     print 'b is max'
#
# str1 = 'Hello Python'
#
# if 'Pyt' in str1:
#     print 'Contain'
# else:
#     print 'Not Contain'
#
# a ='Hello Python'
#
# for i in a:
#     print i
# print len(a)
#
# arrs =['One',2,['Three',2]]
#
# for arr in arrs:
#     print arr
#
# for i in range(1,20,2):
#     print i

# list1 = [1,2,3,4,5]
# list1.append(6)
# print list1
# dicts ={1:'J',2:'a'}
# # print dicts.has_key(1)
# for key, value in dicts.items():
#     print 'key is %r, value is %r' %(key,value)
# keys = [1, 2]
# values = ['A', 'B']
# for k, v in zip(keys, values):
#     print k, v

# Functions
# def add(a,b):
#     return a+b
# print add(1,2)
# def add2(a=1,b=3):
#     return a+b
# print add2()

# Class
# class cl1():
#     def add(self,a):
#         return (a+1)*2
# newObj = cl1()
# print newObj.add(3)
# class A():
#     def __init__(self, a, b):
#         self.a = int(a)
#         self.b = int(b)
#
#     def add(self):
#         return self.a + self.b
# count = A(1, 3)
# print count.add()

# inherit

# class A():
#     def add(self,a,b):
#         return a+b
# class B(A):
#     def sub(self,a,b):
#         return a-b
# print B().add(3,4)

# model

# print time.ctime()

# print help(time)
# print 'test02'
# def testadd(a,b):
#     return a+b

# Exception

try:
    open('abc.txt','r')
except BaseException as msg:
    print msg















