package org.necrotic.client.graphics.rsinterface;

import org.necrotic.client.graphics.Sprite;

/**
 *
 * @author Tringan
 *
 */
class InterfaceComponent {

	/**
	 * The at action type of a component
	 */
	private int atActionType;

	/**
	 * The content type
	 */
	private int contentType;

	/**
	 * The height of the interface
	 */
	private int height;

	/**
	 * The hover type
	 */
	private int hoverType;

	/**
	 * The component id
	 */
	private int id;

	/**
	 * Represents if the interface is shown
	 */
	private boolean interfaceShown;

	/**
	 * The opacity of a component
	 */
	private int opacity;

	/**
	 * The component parentId
	 */
	private int parentId;

	/**
	 * The maximium value that the scroll can take
	 */
	private int scrollMax;

	/**
	 * The sprites used by a component
	 */
	private Sprite[] sprites;

	/**
	 * The tooltip used by a component
	 */
	private String toolTip;

	/**
	 * The interface type
	 */
	private int type;
	/**
	 * The width of the interface
	 */
	private int width;

	public InterfaceComponent() {
	}

	/**
	 * Return the at action type
	 *
	 * @return int
	 */
	public int getAtActionType() {
		return atActionType;
	}

	/**
	 * Return the content type
	 *
	 * @return int
	 */
	public int getContentType() {
		return contentType;
	}

	/**
	 * Return the height
	 *
	 * @return int
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * Return the hover type
	 *
	 * @return int
	 */
	public int getHoverType() {
		return hoverType;
	}

	/**
	 * Return the id
	 *
	 * @return int
	 */
	public int getId() {
		return id;
	}

	/**
	 * Return the opacity
	 *
	 * @return int
	 */
	public int getOpacity() {
		return opacity;
	}

	/**
	 * Return the parent id
	 *
	 * @return int
	 */
	public int getParentId() {
		return parentId;
	}

	/**
	 * Return the scrollmax
	 *
	 * @return int
	 */
	public int getScrollMax() {
		return scrollMax;
	}

	/**
	 * Return the sprite
	 *
	 * @return Sprite[]
	 */
	public Sprite[] getSprites() {
		return sprites;
	}

	/**
	 * Return the tooltip
	 *
	 * @return String
	 */
	public String getToolTip() {
		return toolTip;
	}

	/**
	 * Return the interface type
	 *
	 * @return int
	 */
	public int getType() {
		return type;
	}

	/**
	 * Return the width
	 *
	 * @return int
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * Return interface is shown
	 *
	 * @return boolean
	 */
	public boolean isInterfaceShown() {
		return interfaceShown;
	}

	/**
	 * Sets the at action type
	 *
	 * @param atActionType int that sets action type
	 */
	public void setAtActionType(int atActionType) {
		this.atActionType = atActionType;
	}

	/**
	 * Sets the content type
	 *
	 * @param contentType int that sets content type
	 */
	public void setContentType(int contentType) {
		this.contentType = contentType;
	}

	/**
	 * Sets the component height
	 *
	 * @param height int that sets height
	 */
	public void setHeight(int height) {
		this.height = height;
	}

	/**
	 * Sets the hover type
	 *
	 * @param hoverType int that sets hover type
	 */
	public void setHoverType(int hoverType) {
		this.hoverType = hoverType;
	}

	/**
	 * Sets the id
	 *
	 * @param id int identifier
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Sets interface shown
	 *
	 * @param interfaceShown boolean that sets whether the interface is shown or not
	 */
	public void setInterfaceShown(boolean interfaceShown) {
		this.interfaceShown = interfaceShown;
	}

	/**
	 * Sets the opacity
	 *
	 * @param opacity int that sets opacity of component
	 */
	public void setOpacity(int opacity) {
		this.opacity = opacity;
	}

	/**
	 * Sets the parent id
	 *
	 * @param parentId int that sets the parent's id
	 */
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	/**
	 * Sets the scroll max
	 *
	 * @param scrollMax int that sets the maximum scroll value
	 */
	public void setScrollMax(int scrollMax) {
		this.scrollMax = scrollMax;
	}

	/**
	 * Sets the sprite
	 *
	 * @param sprites Sprite array that sets the list of sprites
	 */
	public void setSprites(Sprite[] sprites) {
		this.sprites = sprites;
	}

	/**
	 * Sets the tooltip
	 *
	 * @param toolTip String that sets the component's tooltip
	 */
	public void setToolTip(String toolTip) {
		this.toolTip = toolTip;
	}

	/**
	 * Sets the component type
	 *
	 * @param type int that sets the type
	 */
	public void setType(int type) {
		this.type = type;
	}

	/**
	 * Sets the component width
	 *
	 * @param width int that sets the width
	 */
	public void setWidth(int width) {
		this.width = width;
	}

}