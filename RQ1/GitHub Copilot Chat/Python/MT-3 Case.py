# Source Code
def md5_etag(self, body=None, set_content_md5=False, set_conditional_response=False):
    """
    Generate an etag for the response object using an MD5 hash of
    the body (the body parameter, or ``self.body`` if not given)
    
    Sets ``self.etag``
    If ``set_content_md5`` is True sets ``self.content_md5`` as well
    If ``set_conditional_response`` is True sets ``self.conditional_response`` to True
    """
    if body is None:
        body = self.body
    try:
        from hashlib import md5
    except ImportError:
        from md5 import md5
    h = md5(body)
    md5_digest = h.digest().encode('base64').replace('\n', '').strip('=')
    self.etag = md5_digest
    if set_content_md5:
        self.content_md5 = md5_digest
    if set_conditional_response:
        self.conditional_response = True

# Synthesized Code, syntax similarity:0.57
def md5_etag(self, body=None, set_content_md5=False, set_conditional_response=False):
    if body is None:
        body = self.body
    md5 = hashlib.md5(body).hexdigest()
    self.etag = md5
    if set_content_md5:
        self.content_md5 = md5
    if set_conditional_response:
        self.conditional_response = True