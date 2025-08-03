import re


def abbreviate(words):
    return ''.join([w[0] for w in re.split("[^A-Z']", words.upper()) if len(w) > 0])
