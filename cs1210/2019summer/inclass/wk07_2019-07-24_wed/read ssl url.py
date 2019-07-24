import urllib.request
import ssl

ssl._create_default_https_context = ssl._create_unverified_context

#urllink = 'https://www.google.com'
#urllink = 'https://kevinlillis.github.io/cs1210/2019summer/index.html'
urllink = 'https://kevinlillis.github.io/cs1210/2019summer/jazz.html'

page = urllib.request.urlopen(urllink)

for line in page:
    if isinstance(line, bytes):
        line = line.decode() # donvert string of bytes to string of characters
    print(line)
    
page.close()