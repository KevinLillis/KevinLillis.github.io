# read-web-page.py

import urllib.request
import ssl

ssl._create_default_https_context = ssl._create_unverified_context

def main():
    urlstring = 'https://kevinlillis.github.io'
    webpage = urllib.request.urlopen(urlstring)

    for line_bytes in webpage:

        line_str = line_bytes.decode('utf-8').rstrip()
        print(line_str)

main()
