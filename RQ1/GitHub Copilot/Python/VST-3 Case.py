def forward(self,x):
    """
        inputs :
            x : input feature maps( B X C X W X H)
        returns :
            out : self attention value + input feature 
            attention: B X N X N (N is Width*Height)
    """
    m_batchsize,C,width ,height = x.size()
    proj_query  = self.query_conv(x).view(m_batchsize,-1,width*height).permute(0,2,1) # B X CX(N)
    proj_key =  self.key_conv(x).view(m_batchsize,-1,width*height) # B X C x (*W*H)
    energy =  torch.bmm(proj_query, proj_key) #transpose check
    attention = self.softmax(energy) # BX (N) X (N) 
    proj_value = self.value_conv(x).view(m_batchsize,-1,width*height) # B X C X N
    
    out = torch.bmm(proj_value,attention.permute(0,2,1) )
    out = out.view(m_batchsize,C,width,height)
    
    out = self.gamma*out + x
    return out
        
# Generated Code by GitHub Copilot
def forward(self,x):
    batch_size, C, width, height = x.size()
    proj_query = self.query_conv(x).view(batch_size, -1, width*height).permute(0,2,1) # B X CX(N)
    proj_key = self.key_conv(x).view(batch_size, -1, width*height) # B X C x (*W*H)
    energy = torch.bmm(proj_query, proj_key) # transpose check
    attention = self.softmax(energy) # BX (N) X (N) 
    proj_value = self.value_conv(x).view(batch_size, -1, width*height) # B X C X N
    
    out = torch.bmm(proj_value, attention.permute(0,2,1))
    out = out.view(batch_size,C,width,height)
    
    out = self.gamma*out + x
    return out, attention