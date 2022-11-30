class BankAccount:
    def __init__(self, holder_name, balance, type):
        # pass
        self.holder_name = holder_name
        self.balance = balance
        self.type = type
        self.rates = {
            "personal" : 5,
            "business" : 45
        }

        
    # def get_account_name(account): #this is no longer required becasuee we can call the property of 'name' in the app.py file
    #     return account["holder_name"]

    def pay_in(self, amount):
        self.balance += amount


    def pay_monthly_fee(self):
        # if self.type == "business":
        #     self.balance -= 45
        # elif self.type == "personal":
        #     self.balance -= 5
        self.balance -= self.rates[self.type]

