package bot.settings;

import java.util.ArrayList;

import commands.management.manager.GuildStatus;
import commands.management.manager.MemberStatus;
import macro.Macro;

public class SettingBuilder {
	protected String currentVersion;
	protected String currentCommandSign;
	protected String currentAdminCommandSign;
	protected boolean colorChatStatus;
	protected boolean autoColorStatus;
	protected boolean embedMessageStatus;
	protected boolean authorEmbedStatus;
	protected String colorChatColor;
	protected String embedColor;
	protected String currentFontStyle;
	protected int currentFontSize;
	protected boolean[] nsfwFilters;
	protected ArrayList<MemberStatus> affectedUsers;// = new ArrayList<MemberStatus>();
	protected ArrayList<GuildStatus> affectedGuilds;// = new ArrayList<GuildStatus>();
	protected ArrayList<String> bannedWordList;
	protected ArrayList<Macro> macros;

	public SettingBuilder() {
	}

	public SettingBuilder(Setting debuilder) {
		currentVersion = debuilder.currentVersion;
		currentCommandSign = debuilder.currentCommandSign;
		currentAdminCommandSign = debuilder.currentAdminCommandSign;
		colorChatStatus = debuilder.colorChatStatus;
		autoColorStatus = debuilder.autoColorStatus;
		embedMessageStatus = debuilder.embedMessageStatus;
		authorEmbedStatus = debuilder.authorEmbedStatus;
		colorChatColor = debuilder.colorChatColor;
		embedColor = debuilder.embedColor;
		currentFontStyle = debuilder.currentFontStyle;
		currentFontSize = debuilder.currentFontSize;
		nsfwFilters = debuilder.nsfwFilters;
		affectedUsers = debuilder.affectedUsers;
		affectedGuilds = debuilder.affectedGuilds;
		bannedWordList = debuilder.bannedWordList;
		macros = debuilder.macros;
	}

	
	public SettingBuilder setCurrentVersion(String currentVersion) {
		this.currentVersion = currentVersion;
		return this;
	}

	public SettingBuilder setCommandSign(String commandSign) {
		this.currentCommandSign = commandSign;
		return this;
	}

	public SettingBuilder setAdminCommandSign(String adminCommandSign) {
		this.currentAdminCommandSign = adminCommandSign;
		return this;
	}

	public SettingBuilder setColorChatStatus(boolean colorChatStatus) {
		this.colorChatStatus = colorChatStatus;
		return this;
	}

	public SettingBuilder setAutoColorStatus(boolean autoColorStatus) {
		this.autoColorStatus = autoColorStatus;
		return this;
	}

	public SettingBuilder setEmbedMessageStatus(boolean embedMessageStatus) {
		this.embedMessageStatus = embedMessageStatus;
		return this;
	}

	public SettingBuilder setAuthorEmbedStatus(boolean authorEmbedStatus) {
		this.authorEmbedStatus = authorEmbedStatus;
		return this;
	}

	public SettingBuilder setColorChatColor(String colorChatColor) {
		this.colorChatColor = colorChatColor;
		return this;
	}

	public SettingBuilder setEmbedColor(String embedColor) {
		this.embedColor = embedColor;
		return this;
	}

	public SettingBuilder setCurrentFontStyle(String currentFontStyle) {
		this.currentFontStyle = currentFontStyle;
		return this;
	}

	public SettingBuilder setCurrentFontSize(int currentFontSize) {
		this.currentFontSize = currentFontSize;
		return this;
	}

	public SettingBuilder setNsfwFilters(boolean[] nsfwFilters) {
		this.nsfwFilters = nsfwFilters;
		return this;
	}

	public SettingBuilder setAffectedUsers(ArrayList<MemberStatus> affectedUsers) {
		this.affectedUsers = affectedUsers;
		return this;
	}

	public SettingBuilder setAffectedGuilds(ArrayList<GuildStatus> affectedGuilds) {
		this.affectedGuilds = affectedGuilds;
		return this;
	}

	public SettingBuilder setBannedWordList(ArrayList<String> bannedWordList) {
		this.bannedWordList = bannedWordList;
		return this;
	}

	public SettingBuilder setMacros(ArrayList<Macro> macros) {
		this.macros = macros;
		return this;
	}

	public Setting build() {
		return new Setting(this);
	}
}