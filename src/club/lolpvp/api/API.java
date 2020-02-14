package club.lolpvp.api;

import java.util.UUID;

import com.mysql.jdbc.log.Log;

import club.lolpvp.teams.Core;
import club.lolpvp.teams.playerteams.Team;
import club.lolpvp.teams.playerwarps.Warps;

public class API {

	/*
	 * Copyright (C) 2019 HAZO.CC DEVELOPMENT
	 * 
	 * Permission is hereby granted, free of charge, to any person obtaining a copy
	 * of this software and associated documentation files (the "Software"), to deal
	 * in the Software without restriction, including without limitation the rights
	 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
	 * copies of the Software, and to permit persons to whom the Software is
	 * furnished to do so, subject to the following conditions:
	 * 
	 * The above copyright notice and this permission notice shall be included in
	 * all copies or substantial portions of the Software.
	 * 
	 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
	 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
	 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
	 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
	 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
	 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
	 * THE SOFTWARE.
	 */
	
	public static Handler handler;
	
	private static Core main = new Core();
	
	private static final Log logger = (Log) main.getLogger();
	
	public API(Handler handler)
	{
		super();
		this.handler = handler;
	}
	
	public String getRankName(UUID uuid)
	{
        throw new UnsupportedOperationException("Unknown API Version");
	}
	
	public String getRankColour(UUID uuid, String rank)
	{
		throw new UnsupportedOperationException("Unknown API Version");
	}
	
	public String getRankPrefix(UUID uuid, String rank)
	{
		throw new UnsupportedOperationException("Unknown API Version");
	}
	
	public String getRankSuffix(UUID uuid, String rank)
	{
		throw new UnsupportedOperationException("Unknown API Version");
	}
	
	public String getPriority(String rank)
	{
		throw new UnsupportedOperationException("Unknown API Version");
	}
	
	public Team getPlayerTeam(UUID uuid)
	{
        throw new UnsupportedOperationException("Unknown API Version");
	}
	
	public Warps getPlayerWarps(UUID uuid)
	{
        throw new UnsupportedOperationException("Unknown API Version");
	}
	
	public static Core getPluginMain()
	{
		return main;
	}

	 final static Log getLogger() {
		return logger;
	}
	
}
