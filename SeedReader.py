def nxt(seed):
    seed2 = (seed * 25214903917 + 11) % 2**48
    return seed2 >> 16


if __name__ == "__main__":
    n1 = int(input("Leak 1: "))
    n2 = int(input("Leak 2: "))
    print("")

    for i in range(65536):
        seed = n1 * 65536 + i

        if nxt(seed) == n2:
            print(f">> found seed: {seed} \n")
            break

    for i in range(10):
        x = seed >> 16
        if x >= 2**31:
            x -= 2**32

        if i > 1:
            print(f"Random {i + 1}: ", x)

        seed = (seed * 25214903917 + 11) % 2**48
