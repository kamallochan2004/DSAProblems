class Solution:
    def areNumbersAscending(self, s: str) -> bool:
        return [int(i) for i in s.split() if i.isnumeric()] == sorted(set(int(i) for i       in s.split() if i.isnumeric()))