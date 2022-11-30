from modules.bank_account import *

# account = {
#     "holder_name" : "John",
#     "balance" : 500,
#     "type" : "business"
# }

johns_account = BankAccount("John", 500, "business")
adas_account = BankAccount("Ada", 1000, "personal")

# print(get_account_name(johns_account))
# print(johns_account.holder_name)
# print(johns_account) #this tells me johns account is an object
# print(BankAccount) #this tells me BankAccount is a class in terminal

# johns_account.type = "personal" #updating the type of account to 'business'
# print(johns_account.type) 


johns_account.pay_in(50)
print(johns_account.balance) 


print(johns_account.balance) 
johns_account.pay_monthly_fee()
print(johns_account.balance) 


print(adas_account.balance) 
adas_account.pay_monthly_fee()
print(adas_account.balance) 


