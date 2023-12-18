# Source Code 1024-2048 01029.py
def call_api(url, type, headers={}, parameters={}, is_json=False):
    """
    Call external API
    :param url:
    :param type:
    :param parameters:
    :param is_json:
    :return:
    """
    app.logger.info("Initiating API Call with following info: url => {} payload => {}".format(url, parameters))
    if "GET" in type:
        response = requests.get(url, headers=headers, params=parameters, timeout=5)
    elif "POST" in type:
        if is_json:
            response = requests.post(url, headers=headers, json=parameters, timeout=5)
        else:
            response = requests.post(url, headers=headers, params=parameters, timeout=5)
    elif "PUT" in type:
        if is_json:
            response = requests.put(url, headers=headers, json=parameters, timeout=5)
        else:
            response = requests.put(url, headers=headers, params=parameters, timeout=5)
    elif "DELETE" in type:
        response = requests.delete(url, headers=headers, params=parameters, timeout=5)
    else:
        raise Exception("unsupported request method.")
    result = json.loads(response.text)
    app.logger.info("API response => %s", result)
    return result

# Synthesized Code, syntax similarity:0.63, res_00007.py
def call_api(url, type, headers={}, parameters={}, is_json=False):

    if type == "GET":
        response = requests.get(url, params=parameters, headers=headers)
    elif type == "POST":
        if is_json:
            response = requests.post(url, json=parameters, headers=headers)
        else:
            response = requests.post(url, data=parameters, headers=headers)
    elif type == "PUT":
        if is_json:
            response = requests.put(url, json=parameters, headers=headers)
        else:
            response = requests.put(url, data=parameters, headers=headers)
    elif type == "DELETE":
        response = requests.delete(url, params=parameters, headers=headers)
    else:
        raise TypeError("Invalid HTTP request type: {}".format(type))
    return response
