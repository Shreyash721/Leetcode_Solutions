class Solution(object):
    def minBishopMoves(self, source, target):
        """
        :type source: List[int]
        :type target: List[int]
        :rtype: int
        """
        sr=source[0]
        sc=source[1]
        tr=target[0]
        tc=target[1]

        if source==target:
            return 0

        if (sc+sr)%2 != (tr+tc)%2:
            return -1
            
        if sr-sc==tr-tc or sr+sc==tr+tc:
            return 1


        return 2
        