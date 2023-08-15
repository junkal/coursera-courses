import http.client as httplib

if __name__ == "__main__":
    connection = httplib.HTTPConnection("www.uci.edu")
    connection.request('GET', '/')
    response = connection.getresponse()
    print(response.read())
