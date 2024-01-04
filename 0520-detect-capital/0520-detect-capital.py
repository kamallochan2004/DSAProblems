class Solution(object):
    def detectCapitalUse(self, word):
        """
        :type word: str
        :rtype: bool
        """
        # Keep track of whether the first letter is capital or not
        first_capital = word[0].isupper()
        
        # Check if all letters in the word are capitals or not
        if all(c.isupper() for c in word[1:]) and first_capital:
            return True
        
        # Check if all letters in the word are not capitals
        if all(c.islower() for c in word[1:]):
            return True
        
        # If none of the above cases hold, return False
        return False