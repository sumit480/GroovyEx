class User {
    String firstName
    String middleInitial
    String lastName
}

def user = new User(firstName: "Dan", lastName: "Woods")
assert user.firstName=="Dan"