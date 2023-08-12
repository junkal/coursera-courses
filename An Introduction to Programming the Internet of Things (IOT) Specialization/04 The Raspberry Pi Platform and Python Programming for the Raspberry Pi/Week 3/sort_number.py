
def get_numbers():
    numbers = []
    numbers.append(int(input("Enter a number:")))
    numbers.append(int(input("Enter a number:")))
    numbers.append(int(input("Enter a number:")))
    return numbers

if __name__ == "__main__":
    num_list = get_numbers()
    num_list.sort()
    print("Sorted list:",num_list)
