package org.canilla.bo;

/**
 * @author Diego Romoli
 * 
 * Models a server from which we will suck news.
 */
public class Newsfeed {

    private String nickname;
    private String address;
    private String username;
    private String password;
    private String port;

    /**
     * Returns the address of this newsfeed.
     * @return the address of this newsfeed.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the address of this newsfeed.
     * @param address the address to set for this newsfeed.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Returns the nickname used to designate this newsfeed.
     * @return the nickname used to designate this newsfeed.
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * Sets the nickname for this newsfeed.
     * @param nickname the nickname for this newsfeed.
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    
    /**
     * Returns the password needed to connect to this newsfeed.
     * @return the password needed to connect to this newsfeed.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the password needed to connect to this newsfeed.
     * @param password the password needed to connect to this newsfeed.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Returns the username used to connect to this newsfeed.
     * @return the username used to connect to this newsfeed.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the username needed to connect to this newsfeed.
     * @param username the username needed to connect to this newsfeed.
     */
    public void setUsername(String username) {
        this.username = username;
    }
    
    /**
     * Returns the port used to connect to this newsfeed.
     * @return the port used to connect to this newsfeed.
     */
    public String getPort() {
        return port;
    }
    
    /**
     * Sets the port used to connect to this newsfeed. 
     * @param port the port used to connect to this newsfeed.
     */
    public void setPort(String port) {
        this.port = port;
    }
}