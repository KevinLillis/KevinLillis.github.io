# read-webpage.py

import urllib.request
def main():
    urlString = 'https://kevinlillis.github.io'
    webPage = urllib.request.urlopen(urlString)
    
    for line_bytes in webPage:
        line_str = line_bytes.decode('utf-8').rstrip()
        print(line_str)
main()
    