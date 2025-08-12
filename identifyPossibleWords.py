class IdentifyPossibleWords:
    @classmethod
    def identifyPossibleWords(cls, input1, input2):
        pattern = input1.lower()
        words = input2.split(':')
        result = []

        for w in words:
            if len(w) == len(pattern):
                match = True
                for pc, wc in zip(pattern, w.lower()):
                    if pc != '_' and pc != wc:
                        match = False
                        break
                if match:
                    result.append(w.upper())

        if result:
            return ':'.join(result)
        else:
            return "ERROR-009"